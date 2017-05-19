package an.royal.gateway.http.dto.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by carl.huang on 19/05/2017.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HttpResponse {
    private String requestId;
    private ErrorResp error;

    public HttpResponse(String requestId) {
        this.requestId = requestId;
    }

    public HttpResponse(String requestId, ErrorResp error) {
        this.requestId = requestId;
        this.error = error;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ErrorResp getError() {
        return error;
    }

    public void setError(ErrorResp error) {
        this.error = error;
    }
}
