package com.example.vuespringpjt.work.service;

import com.example.vuespringpjt.work.domain.WorkRequestDTO;
import com.example.vuespringpjt.work.domain.WorkResponseDTO;
import com.example.vuespringpjt.work.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {

    @Autowired
    private WorkMapper workMapper;

    public List<WorkResponseDTO> getWorks() {
        System.out.println(">>> debug Work service getWorks ");
        return workMapper.findAll();
    }

    public void addWork(WorkRequestDTO params) {
        System.out.println(">>> debug Work service addWork ");
        workMapper.addWork(params);
    }

    public void deleteWork(Integer params) {
        System.out.println(">>> debug Work service deleteWork ");
        workMapper.deleteWork(params);
    }

    public WorkResponseDTO findWork(Integer params) {
        System.out.println(">>> debug Work service findWork ");
        return workMapper.findWork(params);
    }

    public void updateWork(WorkRequestDTO params) {
        System.out.println("debug Work service updateWork");
        workMapper.updateWork(params);
    }

}
