package service;

import bean.Device;
import bean.HealthValues;
import bean.Module;

import java.util.List;

public interface DeviceService {

    void addDevice(Device device)throws Exception;

    List<Device> findDeviceByUserID(String uid) throws Exception;

    void addModule(Module module) throws Exception;

    List<Module> findModule()throws Exception;

    Module findModuleIdByDevice(String dname)throws Exception;

    void changDeviceMod(String dname, String changeMid, String deviceMid) throws Exception;

    List<Device> findRealtimeWorkDevice(String uid) throws Exception;

    List<HealthValues> getHealthValuesByDev(String devicename) throws Exception;
}
