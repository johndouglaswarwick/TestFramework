package com.john.test;

import java.util.List;


public final class EnvironmentJenkins extends EnvironmentSettingsLocal{

    private List<String> environmentSettings;

    public EnvironmentJenkins()
    {
    }

    private boolean checkforJenkins()
    {
        // if jenkins variables found
        // build a list of them and store them in environmentSettings
        // if not return false
        return false;
    }

    @Override
    public String url()
    {
        if ( !checkforJenkins())
            return super.url();
        else
            // this would be different if jenkins was available but put the same code here as a place holder
            return super.url();
    }

 }
