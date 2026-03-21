package com.calia.internal.base;

import com.calia.GameComponent;

public class InternalManager {
    TopDownBase topDownBase;

    public InternalManager(TopDownBase topDownBase) {
        this.topDownBase = topDownBase;
    }

    public void registerGameComponent(GameComponent gameComponent) {
        topDownBase.registerComponent(gameComponent);
    }
}
