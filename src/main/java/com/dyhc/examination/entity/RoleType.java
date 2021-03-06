package com.dyhc.examination.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_type", schema = "hospital_test_manager_db", catalog = "")
public class RoleType {
    private int roleId;
    private String roleName;

    @Id
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleType roleType = (RoleType) o;
        return roleId == roleType.roleId &&
                Objects.equals(roleName, roleType.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName);
    }
}
