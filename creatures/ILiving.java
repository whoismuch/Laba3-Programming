package laba3.creatures;

import laba3.environment.ISpace;
import laba3.environment.Space;

public interface ILiving extends ISpace {
    void setSpace(Space space);
}
