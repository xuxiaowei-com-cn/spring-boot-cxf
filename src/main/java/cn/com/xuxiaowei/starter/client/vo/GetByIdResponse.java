package cn.com.xuxiaowei.starter.client.vo;

import lombok.Data;

@Data
public class GetByIdResponse {

    private Response response;

    @Data
    private static class Response {

        private String id;

        private String username;

        private String password;

    }

}
