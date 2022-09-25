/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 *
 * @author joseb
 */
public class InfractionDetail {
    private Integer id;
    private Integer infractionId;
    private Integer sacntionId;

    public InfractionDetail() {
    }

    public InfractionDetail(Integer id, Integer infractionId, Integer sacntionId) {
        this.id = id;
        this.infractionId = infractionId;
        this.sacntionId = sacntionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInfractionId() {
        return infractionId;
    }

    public void setInfractionId(Integer infractionId) {
        this.infractionId = infractionId;
    }

    public Integer getSacntionId() {
        return sacntionId;
    }

    public void setSacntionId(Integer sacntionId) {
        this.sacntionId = sacntionId;
    }
    
    
    
}
