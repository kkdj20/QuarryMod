package quarrymod.quarries;

import necesse.entity.objectEntity.AnyLogFueledProcessingTechInventoryObjectEntity;
import necesse.inventory.InventoryItem;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Tech;
import necesse.level.maps.Level;

import static quarrymod.QuarryMod.GOLDQUARRY;
import static quarrymod.QuarryMod.STONEQUARRY;

public class ProcessingGoldQuarryObjectEntity extends AnyLogFueledProcessingTechInventoryObjectEntity {
    public static int logFuelTime = 35000;

    public static int recipeProcessTime = 10000;

    public ProcessingGoldQuarryObjectEntity(Level level, int x, int y) {
        super(level, "goldquarry", x, y, 2, 2, false, false, true, new Tech[] {GOLDQUARRY});
    }

    public int getFuelTime(InventoryItem item) {
        return logFuelTime;
    }

    public int getProcessTime(Recipe recipe) {
        return recipeProcessTime;
    }
}

