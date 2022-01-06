package cn.com.xuxiaowei.client.service;

import cn.com.xuxiaowei.client.bo.UserBo;
import cn.com.xuxiaowei.client.utils.CxfClientUtils;
import cn.com.xuxiaowei.client.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 用户 WebService 接口-客户端-测试类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
class UserServiceClientTests {

    @Test
    void getById() {

        UserServiceClient userServiceClient = CxfClientUtils.create("http://127.0.0.1:8080/ws/userService?wsdl",
                UserServiceClient.class);

        UserBo userBo = new UserBo();
        userBo.setId("1111111");
        UserVo userVo = userServiceClient.getById(userBo);

        log.info(String.valueOf(userVo));
    }

}
