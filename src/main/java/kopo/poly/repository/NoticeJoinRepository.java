package kopo.poly.repository;

import kopo.poly.repository.entity.NoticeEntity;
import kopo.poly.repository.entity.NoticeJoinEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoticeJoinRepository extends JpaRepository<NoticeJoinEntity, Long> {

    List<NoticeJoinEntity> findAllByOrderByNoticeSeqDesc();
}
