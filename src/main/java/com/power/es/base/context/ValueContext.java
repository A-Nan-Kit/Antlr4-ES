package com.power.es.base.context;

import com.power.es.base.common.ValueTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author A_Nan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValueContext {
    private ValueTypeEnum type;
    private Object value;
}
