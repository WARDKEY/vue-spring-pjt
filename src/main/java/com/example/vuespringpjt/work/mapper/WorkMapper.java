package com.example.vuespringpjt.work.mapper;

import com.example.vuespringpjt.work.domain.WorkRequestDTO;
import com.example.vuespringpjt.work.domain.WorkResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkMapper {
    // mapper에 정의된 메서드 이름은 추후 .xml 파일에 정의 되는 태그의 식별자 역할
    public List<WorkResponseDTO> findAll();

    public void addWork(WorkRequestDTO params);

    public void deleteWork(Integer params);

    public WorkResponseDTO findWork(Integer params);

    public void updateWork(WorkRequestDTO params);


}
