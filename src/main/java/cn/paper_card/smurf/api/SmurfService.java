package cn.paper_card.smurf.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface SmurfService {

    // 添加小号
    void addSmurf(@NotNull SmurfInfo info) throws Exception;

    // 删除小号
    boolean removeSmurf(@NotNull UUID main, @NotNull UUID smurf) throws Exception;

    // 根据小号UUID查询
    @Nullable SmurfInfo queryBySmurfUuid(@NotNull UUID uuid) throws Exception;

    @NotNull List<SmurfInfo> queryByMainUuid(@NotNull UUID uuid, int limit, int offset) throws Exception;
}
