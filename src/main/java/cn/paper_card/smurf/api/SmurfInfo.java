package cn.paper_card.smurf.api;

import java.util.UUID;

public record SmurfInfo(
        UUID mainUuid,
        String mainName,
        UUID smurfUuid,
        String smurfName,

        long time,
        String remark
) {
}
