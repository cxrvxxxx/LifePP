package com.anq.LifePP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.anq.LifePP.Entity.QuestEntity;

@Repository
public interface QuestRepository extends JpaRepository<QuestEntity, Integer>{
	
}