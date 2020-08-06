package com.company.ordersbackend.model;

import com.company.ordersbackend.domain.AppUser;
import com.company.ordersbackend.domain.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data()
public class OrderDTO {

    private long id;

    private AppUser appUser;

    @NotNull
    @NotBlank
    private String name;


    private List<ItemInOrderDTO> itemsInOrder = new ArrayList<>();

    private LocalDateTime creationDate;

    private LocalDateTime closedDate;

    private OrderStatus orderStatus;

    public OrderDTO() {
        this.creationDate = LocalDateTime.now();
    }


    public OrderDTO(@NotNull AppUser appUser, List<ItemInOrderDTO> itemsInOrder, LocalDateTime creationDate, LocalDateTime closedDate) {
        this.appUser = appUser;
        this.itemsInOrder = itemsInOrder;
        this.creationDate = creationDate;
        this.closedDate = closedDate;
    }
}