package ahmed.abdullahi.mcsqahwaservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
*
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QahwaDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String qahwaName;
    private QahwaStyleEnum qahwaStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
