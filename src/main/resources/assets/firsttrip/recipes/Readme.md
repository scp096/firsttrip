## 合成配方解释

### 1. 合成配方放置路径
在mod resources.assets.{modId}.recipes文件夹中新建JSON 文件

### 2. 合成方式

#### 2.1 无序合成
* **type (合成类型) : **forge:ore_shapeless 代表**无序合成**
* **ingredients (合成配方) : **在JSON数组里填充item就可以了
* **result (合成结果）: **item的name
* **item (物品）: **{modId}:{物品id}，当物品有metadata同位素时，比如stone有石头和花岗岩不同物品id的stone，需要指定data物品id属性，data = 32767时代表任意改物品类型，data值具体可以在游戏使用F3+H打开观察物品id模式查看物品id。

```JSON
{
  "type" : "forge:ore_shapeless",

  "ingredients" : [
    [
      { "item" :  "minecraft:stone",
      	"data" : 32767
      },
      { "item" : "minecraft:diamond"}
    ]
  ],
  "result" : "minecraft:gold"
}



```



### 2.2 有序合成

* **type (合成类型) : **minecraft:crafting_shaped 代表**有序合成**

* **pattern(合成顺序)** : 3*3的字符串数组，比如合成铁镐的顺序 ["AAA", " B ", " B " ]

* **key(合成材料key)** : 一个key/value类型的map，key是pattern合成顺序上的字符，value是字符对应的合成物品ID

```json
{
  "type" : "minecraft:crafting_shaped",

  "pattern" : [
    "RRR",
    "RRR",
    "RRR"
  ],

  "key" : {
    "R" : {
      "item" : "firsttrip:obsidian_ingot"
    }
  },

  "result" : {
    "item" : "minecraft:obsidian",
    "count" : 1
  }
}
```