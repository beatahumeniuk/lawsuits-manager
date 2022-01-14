package pl.beatahumeniuk.lawsuitsmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LawsuitCode {
    SENT("123"),
    CREATED("432");
    private final String value;
}
