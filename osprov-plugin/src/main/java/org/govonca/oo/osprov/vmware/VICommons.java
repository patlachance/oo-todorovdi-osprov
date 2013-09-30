package org.govonca.oo.osprov.vmware;


import org.govonca.oo.osprov.vmware.VIActions;

import com.hp.oo.sdk.content.annotations.Action;
import com.hp.oo.sdk.content.annotations.Output;
import com.hp.oo.sdk.content.annotations.Param;
import com.hp.oo.sdk.content.annotations.Response;
import com.hp.oo.sdk.content.plugin.ActionMetadata.MatchType;
import com.hp.oo.sdk.content.plugin.ActionMetadata.OOActionInput;
import com.hp.oo.sdk.content.plugin.ActionMetadata.ResponseType;

import com.vmware.vim25.*;
import com.vmware.vim25.mo.*;

import com.google.gson.*;

import java.net.URL;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;



public class VICommons {
    public static final Map<String,String> INPUT_VALUES;
    static{
        INPUT_VALUES = new HashMap<String,String>();
        INPUT_VALUES.put("HOST","host");
        INPUT_VALUES.put("USERNAME","host");
    }



}