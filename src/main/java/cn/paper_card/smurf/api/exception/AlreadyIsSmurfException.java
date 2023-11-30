package cn.paper_card.smurf.api.exception;

import cn.paper_card.smurf.api.SmurfInfo;
import org.jetbrains.annotations.NotNull;


@SuppressWarnings("unused")
public class AlreadyIsSmurfException extends Exception {

    private final @NotNull SmurfInfo smurfInfo;

    public AlreadyIsSmurfException(@NotNull SmurfInfo smurfInfo, @NotNull String message) {
        super(message);
        this.smurfInfo = smurfInfo;
    }

    public @NotNull SmurfInfo getSmurfInfo() {
        return this.smurfInfo;
    }
}
