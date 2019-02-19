package com.coding.mrpImplementation.controller;

import com.coding.mrpImplementation.model.Company;
import com.coding.mrpImplementation.model.Machine;
import com.coding.mrpImplementation.model.MachineTask;
import com.coding.mrpImplementation.service.persistence.CompanyRepository;
import com.coding.mrpImplementation.service.persistence.MachineRepository;
import com.coding.mrpImplementation.service.persistence.MachineTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path="/mrp")
public class MachineTaskController extends MRPController {
    @Autowired
    private MachineTaskRepository machineTaskRepository;



    @PostMapping(path="/company/{nit}/machine/{id_machine}")
    public  @ResponseBody
    String addMachineTask (@PathVariable(value="nit")String nit, @PathVariable(value="id_machine")String id_machine, @RequestBody MachineTask machineTask){
        machineTaskRepository.save(machineTask);
        return "Saved";
    }


}
