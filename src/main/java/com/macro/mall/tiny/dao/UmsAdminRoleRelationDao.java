package com.macro.mall.tiny.dao;


import com.macro.mall.tiny.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * @author  macro on 2018/10/8.
 */
@Repository
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     * @param adminId
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
