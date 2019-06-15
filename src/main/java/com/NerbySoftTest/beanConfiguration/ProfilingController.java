package com.NerbySoftTest.beanConfiguration;

public class ProfilingController implements ProfilingControllerMbean{
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
