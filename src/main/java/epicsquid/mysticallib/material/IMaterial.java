package epicsquid.mysticallib.material;

import epicsquid.mysticallib.block.OreBlockProperties;
import net.minecraft.block.Block;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public interface IMaterial {

	IItemTier getTier();

	IArmorMaterial getArmor();

	Item.Properties getItemProps();

	Block.Properties getBlockProps();

	OreBlockProperties getBlockOreProps();

	boolean hasOre();

	float getAttackSpeed(String name);

	float getAttackDamage(String name);

	String getName();
}