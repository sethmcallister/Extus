package xyz.mcallister.extus.handlers;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sethm on 20/06/2016.
 */
public class Viloations
{
    private static ConcurrentHashMap<String, Integer> vio = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<UUID, ConcurrentHashMap<String, Integer>> violation = new ConcurrentHashMap<>();

    public static Integer getViolocation(UUID uuid, String cheat)
    {
        if(violation.contains(uuid) && violation.get(uuid).get(cheat) != null)
        {
            return violation.get(uuid).get(cheat);
        }
        return 0;
    }

    public static void setViolocation(UUID uuid,String cheat, Integer newlevel)
    {
        vio.put(cheat, newlevel);
        violation.put(uuid, vio);
    }
}