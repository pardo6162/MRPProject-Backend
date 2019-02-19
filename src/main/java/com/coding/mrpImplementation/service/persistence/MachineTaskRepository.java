package com.coding.mrpImplementation.service.persistence;

import com.coding.mrpImplementation.model.MachineTask;
import com.coding.mrpImplementation.model.Material;

import java.util.List;

public interface MachineTaskRepository {
    MachineTask save(MachineTask machineTask);
    List<MachineTask> findAll();
    Material findById(String id);
    void delete(MachineTask machineTask);
}
