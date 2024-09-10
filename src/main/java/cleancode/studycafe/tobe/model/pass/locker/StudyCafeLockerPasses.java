package cleancode.studycafe.tobe.model.pass.locker;

import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;

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

    public Optional<StudyCafeLockerPass> findLockerPassBy(StudyCafeSeatPass selectedPass) {

        return passes.stream()
                .filter(selectedPass::isSameDurationType)
                .findFirst();
    }
}
