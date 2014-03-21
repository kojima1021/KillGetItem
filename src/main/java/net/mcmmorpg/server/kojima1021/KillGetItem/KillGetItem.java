package net.mcmmorpg.server.kojima1021.KillGetItem;

import net.mcmmorpg.server.kojima1021.KillGetItem.Event.death;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * KillGetItem メインクラス
 * @author kojima1021
 */
public class KillGetItem extends JavaPlugin implements Listener{
    //インスタンス
    private static KillGetItem instance;
    /**
     * メインクラスを取得します
     * @return instance
     */
    public static KillGetItem getInstance(){
        return instance;
    }
    //Plugin開始時
    @Override
    public void onEnable() {
        //初期設定完了
        getLogger().info("Ver.1.0.0");
        //リスナー登録
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new death(), this);
    }
    //Pluginun終了時
    @Override
    public void onDisable() {
        getLogger().info("プラグインを正常に終了しました。");
    }
}