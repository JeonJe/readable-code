package cleancode.studycafe.tobe.model;

import java.util.List;
import java.util.Optional;

public class StudyCafeLockerPasses {
    private final List<StudyCafeLockerPass> passes;

    public StudyCafeLockerPasses(List<StudyCafeLockerPass> lokcerPasses) {
        this.passes = lokcerPasses;
    }

    public static StudyCafeLockerPasses of(List<StudyCafeLockerPass> lockerPasses) {
        return new StudyCafeLockerPasses(lockerPasses);
    }

    public Optional<StudyCafeLockerPass> findLockerPassBy(StudyCafePass selectedPass) {

        return passes.stream()
                .filter(selectedPass::isSameDurationType)
                .findFirst();
    }
}
