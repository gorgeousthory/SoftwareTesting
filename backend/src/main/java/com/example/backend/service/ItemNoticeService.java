package com.example.backend.service;

//import com.example.backend.entity.Classification;
import com.example.backend.entity.ItemNotice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * /28
 * @JDKVersion 17.0.4
 */
@Service
public interface ItemNoticeService {
    List<ItemNotice> findItemNotice(Long userId);
    int modifyItemNoticeStatus(Long itemNoticeId);

    int addItemNotice(ItemNotice itemNotice);

    Integer deleteItemNotice(Long item_notice_id);
}
