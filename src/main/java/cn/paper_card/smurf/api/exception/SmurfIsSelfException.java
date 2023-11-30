package cn.paper_card.smurf.api.exception;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class SmurfIsSelfException extends Exception {
    public SmurfIsSelfException(@NotNull String message) {
        super(message);
    }
}
