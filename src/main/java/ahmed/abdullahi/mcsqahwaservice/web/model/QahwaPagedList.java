package ahmed.abdullahi.mcsqahwaservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class QahwaPagedList extends PageImpl<QahwaDto> {
    public QahwaPagedList(List<QahwaDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public QahwaPagedList(List<QahwaDto> content) {
        super(content);
    }
}
