/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;
import java.math.BigDecimal;
import java.util.*;
/**
 *
 * @author joseb
 */
public class Infraction {
    private Integer id;
    private Integer agentId;
    private Date createdAt;
    private Boolean status;
    private BigDecimal total;
    private Integer vehicleId;

    public Infraction() {
    }

    public Infraction(Integer id, Integer agentId, Date createdAt, Boolean status, BigDecimal total, Integer vehicleId) {
        this.id = id;
        this.agentId = agentId;
        this.createdAt = createdAt;
        this.status = status;
        this.total = total;
        this.vehicleId = vehicleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    
    
    
}
