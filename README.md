# TheWeirdSquid's Basic Mod
Basic Mod is a mod for Minecraft Forge 1.12.X.

The purpose of this mod is not to add any functionality or gameplay aspects to minecraft, but instead contain framework and examples for different types of items and blocks that you may want to create. This mod will have framework in place to make modding a matter of copying, pasting, and specifying types.

## Contents
[Item Types](#Item-Types):
- [Basic Item](#Basic-Item)

[Block Types](#Block-Types):
- [Basic Block](#Basic-Block)

## Item Types

### Basic Item
The basic item is a simple item that is not usable (ex. a material such as diamonds or iron ingots), but is just used in crafting recipies.

#### Technical
A basic item is initialized using the `ItemBase` class. It takes two arguments: `name` and `tab`.
- `name`: a `String` specifying the internal name of the item.
- `tab`: a `CreativeTabs` object specifying the tab that the item will be in in the creative inventory.

## Block Types

### Basic Block
The basic block is a simple block that does not have a function and has no special properties.

#### Technical
The basic block is initialized using the `BlockBase` class. It takes three arguments: `name`, `material`, and `tab`.
- `name`: a `String` specifying the internal name of the block.
- `material`: a `Materials` object that specifies the block's sounds.
- `tab`: a `CreativeTabs` object specifying the tab that the block will be in in the creative inventory.
