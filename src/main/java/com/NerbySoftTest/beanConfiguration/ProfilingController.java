package com.NerbySoftTest.beanConfiguration;

public class ProfilingController implements ProfilingControllerMbean {

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
