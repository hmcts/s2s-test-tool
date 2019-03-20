package uk.gov.hmcts.reform.servicetokenprovider;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/token")
@RestController
public class TokenController {

    private final AuthorizationHeadersProvider authorizationHeadersProvider;

    public TokenController(AuthorizationHeadersProvider authorizationHeadersProvider) {
        this.authorizationHeadersProvider = authorizationHeadersProvider;
    }

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public ResponseEntity<String> getToken() {

        return ResponseEntity.ok(authorizationHeadersProvider.getServiceAuthorization());
    }
}
