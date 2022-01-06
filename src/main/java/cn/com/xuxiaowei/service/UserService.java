package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.bo.UserBo;
import cn.com.xuxiaowei.vo.UserVo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 用户 WebService 接口
 *
 * @author 徐晓伟
 */
@WebService(targetNamespace = "http://service.xuxiaowei.com.cn")
public interface UserService {

    /**
     * 根据 用户ID 查询用户
     *
     * @param userBo 用户ID
     * @return 返回 用户
     */
    @WebMethod
    @WebResult(name = "response")
    UserVo getById(@WebParam(name = "request") UserBo userBo);

}
