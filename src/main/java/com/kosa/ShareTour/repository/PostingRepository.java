package com.kosa.ShareTour.repository;

import com.kosa.ShareTour.entity.Posting;
import com.kosa.ShareTour.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PostingRepository extends JpaRepository<Posting, Integer>{


    List<Posting> findByUserNickname(String userNickname);

    List<Posting> findByTitle(String title);

    void deleteByTitle(String title);


}