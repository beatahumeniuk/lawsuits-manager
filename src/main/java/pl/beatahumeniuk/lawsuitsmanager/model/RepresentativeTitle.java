package pl.beatahumeniuk.lawsuitsmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RepresentativeTitle {
    LAWYER("adw."),
    SOLICITOR("rpr.");
    private final String value;
}
