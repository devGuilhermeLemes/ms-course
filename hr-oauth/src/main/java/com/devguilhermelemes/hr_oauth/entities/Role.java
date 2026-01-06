package com.devguilhermelemes.hr_oauth.entities;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String roleName;

    public Role() {
    }

    public Role(long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Role other = (Role) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
