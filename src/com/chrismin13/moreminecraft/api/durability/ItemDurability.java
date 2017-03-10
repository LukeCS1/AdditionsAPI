package com.chrismin13.moreminecraft.api.durability;

import java.util.HashMap;

import org.bukkit.Material;

public class ItemDurability {

	private int blockBreak = 0;
	private int instantBlockBreak = 0;
	private int entityHit = 0;
	private HashMap<Material, Integer> specialBlockBreak = null;

	/**
	 * @return the blockBreak
	 */
	public int getBlockBreak() {
		return blockBreak;
	}

	/**
	 * @param blockBreak
	 *            the blockBreak to set
	 */
	public void setBlockBreak(int blockBreak) {
		this.blockBreak = blockBreak;
	}

	/**
	 * @return the instantBlockBreak
	 */
	public int getInstantBlockBreak() {
		return instantBlockBreak;
	}

	/**
	 * @param instantBlockBreak
	 *            the instantBlockBreak to set
	 */
	public void setInstantBlockBreak(int instantBlockBreak) {
		this.instantBlockBreak = instantBlockBreak;
	}

	/**
	 * @return the entityHit
	 */
	public int getEntityHit() {
		return entityHit;
	}

	/**
	 * @param entityHit
	 *            the entityHit to set
	 */
	public void setEntityHit(int entityHit) {
		this.entityHit = entityHit;
	}

	/**
	 * 
	 * Adds a Special Block.
	 * 
	 * Special Blocks will override the BlockBreak and InstantBlockBreak and
	 * damage the item.
	 * 
	 * @param material
	 *            - the block
	 * @param durability
	 *            - the durability that will be cut
	 */
	public void addSpecialBlock(Material material, int durability) {
		if (specialBlockBreak == null)
			specialBlockBreak = new HashMap<Material, Integer>();
		specialBlockBreak.put(material, durability);
	}

	/**
	 * @return the map that contains the special blocks with their durabilities
	 */
	public HashMap<Material, Integer> getAllSpecialBlocks() {
		return specialBlockBreak;
	}

	/**
	 * 
	 * Get the Durability that will be cut for the Block Specified
	 * 
	 * @param material
	 *            - the block
	 * @return the durability that will be cut
	 */
	public Integer getSpecialBlockDurability(Material material) {
		if (specialBlockBreak != null && specialBlockBreak.get(material) != null)
			return specialBlockBreak.get(material);
		return null;
	}

}
