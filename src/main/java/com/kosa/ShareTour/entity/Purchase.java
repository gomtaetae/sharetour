package com.kosa.ShareTour.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="purchases")
@Setter
@Getter
public class Purchase implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name="members_id")
    private Member memberId;

    @ManyToOne
    @JoinColumn(name="packages_id")
    private Item itemId;

}