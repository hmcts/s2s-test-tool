package uk.gov.hmcts.reform.servicetokenprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gov.hmcts.reform.authorisation.generators.AuthTokenGenerator;

@Service
public class AuthorizationHeadersProvider {

    @Autowired
    private AuthTokenGenerator serviceAuthTokenGenerator;

    public String getServiceAuthorization() {
        return serviceAuthTokenGenerator.generate();
    }
}
