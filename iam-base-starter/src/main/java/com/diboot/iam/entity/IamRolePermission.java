/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.iam.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.diboot.core.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
* 角色权限关联 Entity定义
* @author mazc@dibo.ltd
* @version 2.0
* @date 2019-12-03
*/
@Getter @Setter @Accessors(chain = true)
public class IamRolePermission extends BaseEntity {
    private static final long serialVersionUID = -8228772361638435896L;

    public IamRolePermission(){
    }
    public IamRolePermission(Long roleId, Long permissionId){
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    /**
     * 租户ID
     */
    @TableField
    private Long tenantId;

    // 角色ID
    @NotNull(message = "角色ID不能为空")
    @TableField()
    private Long roleId;

    // 权限ID
    @NotNull(message = "权限ID不能为空")
    @TableField()
    private Long permissionId;

}
