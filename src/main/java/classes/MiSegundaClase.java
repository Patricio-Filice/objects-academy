package classes;

import java.util.Objects;

public class MiSegundaClase {
    private String Propieadad1;

    public String getPropieadad1() {
        return Propieadad1;
    }

    public void setPropieadad1(String propieadad1) {
        Propieadad1 = propieadad1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MiSegundaClase)) return false;
        MiSegundaClase that = (MiSegundaClase) o;
        return Objects.equals(getPropieadad1(), that.getPropieadad1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropieadad1());
    }
}
