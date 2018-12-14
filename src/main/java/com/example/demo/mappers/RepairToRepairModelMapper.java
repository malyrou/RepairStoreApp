package com.example.demo.mappers;


import com.example.demo.domain.Repair;
import com.example.demo.models.RepairModel;
import org.springframework.stereotype.Component;

@Component
public class RepairToRepairModelMapper {
    public RepairModel mapToRepairModel(Repair repair) {
            RepairModel repairModel = new RepairModel(repair.getDescription(), repair.getDayOfRepair(), repair.getRepairStatus(), repair.getRepairType(), repair.getServiceCost(), repair.getPlateNumber(), repair.getOwner());
            return repairModel;
    }
}
