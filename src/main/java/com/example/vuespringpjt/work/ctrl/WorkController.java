package com.example.vuespringpjt.work.ctrl;

import com.example.vuespringpjt.work.domain.WorkRequestDTO;
import com.example.vuespringpjt.work.domain.WorkResponseDTO;
import com.example.vuespringpjt.work.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkController {

    @Autowired
    private WorkService workService;
    //          cors 발생
    // vue(http://localhost:8080/works) ------------> http://localhost:8888/works
    @GetMapping("/works")
    public List<WorkResponseDTO> works() {
        System.out.println(">>> debug Work Ctrl GET: /works");
        List<WorkResponseDTO> result = workService.getWorks();

        return result;
    }


    @PostMapping("/save")
    public String save(@RequestBody WorkRequestDTO params) {
        System.out.println(">>> debug work Ctrl POST: /save");
        System.out.println(">>> debug request params , " + params);
        workService.addWork(params);
        return null;
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println(">>> debug work Ctrl DELETE: /delete/id");
        System.out.println(">>> debug request params , " + id);
        workService.deleteWork(id);
        return null;
    }

    @GetMapping("find/{id}")
    public WorkResponseDTO find(@PathVariable Integer id) {
        System.out.println(">>> debug work Ctrl GET: /find/id");
        System.out.println(">>> debug request params , " + id);

        return workService.findWork(id);
    }

    @PutMapping("update")
    public String update(@RequestBody WorkRequestDTO params) {
        System.out.println(">>> debug work Ctrl GET: /find/id");
        System.out.println(">>> debug request params , " + params);
        workService.updateWork(params);
        return null;
    }

}
