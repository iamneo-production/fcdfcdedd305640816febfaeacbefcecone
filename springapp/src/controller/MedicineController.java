package com.example.controller;

import src.model.Medicine;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/medicines")\
public class MedicineController{
    private final map<Integer, Medicine> medim = new HashMap<>();
    private int nextmid = 1;

    @PostMapping("/")
    public boolean addMedicine(@RequestBody Medicine medicine){
        medicine.setMedicineId
    }
}