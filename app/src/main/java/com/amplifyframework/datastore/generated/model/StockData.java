package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.ModelIdentifier;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the StockData type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "StockData", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class StockData implements Model {
  public static final QueryField ID = field("StockData", "id");
  public static final QueryField NAME = field("StockData", "name");
  public static final QueryField SYMBOL = field("StockData", "symbol");
  public static final QueryField SECTOR = field("StockData", "sector");
  public static final QueryField DAILY_COUNT = field("StockData", "dailyCount");
  public static final QueryField WEEKLY_COUNT = field("StockData", "weeklyCount");
  public static final QueryField MONTHLY_COUNT = field("StockData", "monthlyCount");
  public static final QueryField YEARLY_COUNT = field("StockData", "yearlyCount");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="String", isRequired = true) String symbol;
  private final @ModelField(targetType="String", isRequired = true) String sector;
  private final @ModelField(targetType="Int", isRequired = true) Integer dailyCount;
  private final @ModelField(targetType="Int", isRequired = true) Integer weeklyCount;
  private final @ModelField(targetType="Int", isRequired = true) Integer monthlyCount;
  private final @ModelField(targetType="Int", isRequired = true) Integer yearlyCount;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  /** @deprecated This API is internal to Amplify and should not be used. */
  @Deprecated
   public String resolveIdentifier() {
    return id;
  }
  
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public String getSymbol() {
      return symbol;
  }
  
  public String getSector() {
      return sector;
  }
  
  public Integer getDailyCount() {
      return dailyCount;
  }
  
  public Integer getWeeklyCount() {
      return weeklyCount;
  }
  
  public Integer getMonthlyCount() {
      return monthlyCount;
  }
  
  public Integer getYearlyCount() {
      return yearlyCount;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private StockData(String id, String name, String symbol, String sector, Integer dailyCount, Integer weeklyCount, Integer monthlyCount, Integer yearlyCount) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
    this.sector = sector;
    this.dailyCount = dailyCount;
    this.weeklyCount = weeklyCount;
    this.monthlyCount = monthlyCount;
    this.yearlyCount = yearlyCount;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      StockData stockData = (StockData) obj;
      return ObjectsCompat.equals(getId(), stockData.getId()) &&
              ObjectsCompat.equals(getName(), stockData.getName()) &&
              ObjectsCompat.equals(getSymbol(), stockData.getSymbol()) &&
              ObjectsCompat.equals(getSector(), stockData.getSector()) &&
              ObjectsCompat.equals(getDailyCount(), stockData.getDailyCount()) &&
              ObjectsCompat.equals(getWeeklyCount(), stockData.getWeeklyCount()) &&
              ObjectsCompat.equals(getMonthlyCount(), stockData.getMonthlyCount()) &&
              ObjectsCompat.equals(getYearlyCount(), stockData.getYearlyCount()) &&
              ObjectsCompat.equals(getCreatedAt(), stockData.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), stockData.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getSymbol())
      .append(getSector())
      .append(getDailyCount())
      .append(getWeeklyCount())
      .append(getMonthlyCount())
      .append(getYearlyCount())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("StockData {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("symbol=" + String.valueOf(getSymbol()) + ", ")
      .append("sector=" + String.valueOf(getSector()) + ", ")
      .append("dailyCount=" + String.valueOf(getDailyCount()) + ", ")
      .append("weeklyCount=" + String.valueOf(getWeeklyCount()) + ", ")
      .append("monthlyCount=" + String.valueOf(getMonthlyCount()) + ", ")
      .append("yearlyCount=" + String.valueOf(getYearlyCount()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static NameStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static StockData justId(String id) {
    return new StockData(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      name,
      symbol,
      sector,
      dailyCount,
      weeklyCount,
      monthlyCount,
      yearlyCount);
  }
  public interface NameStep {
    SymbolStep name(String name);
  }
  

  public interface SymbolStep {
    SectorStep symbol(String symbol);
  }
  

  public interface SectorStep {
    DailyCountStep sector(String sector);
  }
  

  public interface DailyCountStep {
    WeeklyCountStep dailyCount(Integer dailyCount);
  }
  

  public interface WeeklyCountStep {
    MonthlyCountStep weeklyCount(Integer weeklyCount);
  }
  

  public interface MonthlyCountStep {
    YearlyCountStep monthlyCount(Integer monthlyCount);
  }
  

  public interface YearlyCountStep {
    BuildStep yearlyCount(Integer yearlyCount);
  }
  

  public interface BuildStep {
    StockData build();
    BuildStep id(String id);
  }
  

  public static class Builder implements NameStep, SymbolStep, SectorStep, DailyCountStep, WeeklyCountStep, MonthlyCountStep, YearlyCountStep, BuildStep {
    private String id;
    private String name;
    private String symbol;
    private String sector;
    private Integer dailyCount;
    private Integer weeklyCount;
    private Integer monthlyCount;
    private Integer yearlyCount;
    @Override
     public StockData build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new StockData(
          id,
          name,
          symbol,
          sector,
          dailyCount,
          weeklyCount,
          monthlyCount,
          yearlyCount);
    }
    
    @Override
     public SymbolStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public SectorStep symbol(String symbol) {
        Objects.requireNonNull(symbol);
        this.symbol = symbol;
        return this;
    }
    
    @Override
     public DailyCountStep sector(String sector) {
        Objects.requireNonNull(sector);
        this.sector = sector;
        return this;
    }
    
    @Override
     public WeeklyCountStep dailyCount(Integer dailyCount) {
        Objects.requireNonNull(dailyCount);
        this.dailyCount = dailyCount;
        return this;
    }
    
    @Override
     public MonthlyCountStep weeklyCount(Integer weeklyCount) {
        Objects.requireNonNull(weeklyCount);
        this.weeklyCount = weeklyCount;
        return this;
    }
    
    @Override
     public YearlyCountStep monthlyCount(Integer monthlyCount) {
        Objects.requireNonNull(monthlyCount);
        this.monthlyCount = monthlyCount;
        return this;
    }
    
    @Override
     public BuildStep yearlyCount(Integer yearlyCount) {
        Objects.requireNonNull(yearlyCount);
        this.yearlyCount = yearlyCount;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String name, String symbol, String sector, Integer dailyCount, Integer weeklyCount, Integer monthlyCount, Integer yearlyCount) {
      super.id(id);
      super.name(name)
        .symbol(symbol)
        .sector(sector)
        .dailyCount(dailyCount)
        .weeklyCount(weeklyCount)
        .monthlyCount(monthlyCount)
        .yearlyCount(yearlyCount);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder symbol(String symbol) {
      return (CopyOfBuilder) super.symbol(symbol);
    }
    
    @Override
     public CopyOfBuilder sector(String sector) {
      return (CopyOfBuilder) super.sector(sector);
    }
    
    @Override
     public CopyOfBuilder dailyCount(Integer dailyCount) {
      return (CopyOfBuilder) super.dailyCount(dailyCount);
    }
    
    @Override
     public CopyOfBuilder weeklyCount(Integer weeklyCount) {
      return (CopyOfBuilder) super.weeklyCount(weeklyCount);
    }
    
    @Override
     public CopyOfBuilder monthlyCount(Integer monthlyCount) {
      return (CopyOfBuilder) super.monthlyCount(monthlyCount);
    }
    
    @Override
     public CopyOfBuilder yearlyCount(Integer yearlyCount) {
      return (CopyOfBuilder) super.yearlyCount(yearlyCount);
    }
  }
  

  public static class StockDataIdentifier extends ModelIdentifier<StockData> {
    private static final long serialVersionUID = 1L;
    public StockDataIdentifier(String id) {
      super(id);
    }
  }
  
}
