package com.teamproject.trackers.biz.reviewInquiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ReviewListRepository extends JpaRepository<ReviewListVO, ReviewId> {
	
	List<ReviewListVO> findAllByPidOrderByCreDateDesc(long pid);
}