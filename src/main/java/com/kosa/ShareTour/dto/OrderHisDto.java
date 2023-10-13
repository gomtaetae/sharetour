package com.kosa.ShareTour.dto;

import com.kosa.ShareTour.constant.OrderStatus;
import com.kosa.ShareTour.entity.Order;
import lombok.Data;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrderHisDto {

    public OrderHisDto(Order order){
        this.orderId = order.getId();
        this.orderDate = order.getOrderDate().format(DateTimeformatter.ofPatter("yyyy-MM-dd HH:mm"));
        this.orderStatus = order.getOrderStatus();

    }

    private Long orderId;

    private String orderDate;

    private OrderStatus orderStatus;

    private List<OrderItemDto> orderItemDtoList =new ArrayList<>();

    public void addOrderItemDto(OrderItemDto orderItemDto){
        orderItemDtoList.add(orderItemDto);
    }
}