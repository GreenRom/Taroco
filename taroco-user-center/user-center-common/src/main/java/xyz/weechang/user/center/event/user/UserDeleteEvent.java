package xyz.weechang.user.center.event.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import xyz.weechang.taroco.core.common.event.AuditableAbstractEvent;
import xyz.weechang.taroco.core.query.domain.AuditEntry;

/**
 * 说明：
 *
 * @author zhangwei
 * @version 2018/2/20 22:10.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class UserDeleteEvent extends AuditableAbstractEvent {
    private static final long serialVersionUID = -3776611693309891636L;

    private Boolean logic;

    public UserDeleteEvent(String id, AuditEntry auditEntry, Boolean logic) {
        super(id, auditEntry);
        this.logic = logic;
    }
}
