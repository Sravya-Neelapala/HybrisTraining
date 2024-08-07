/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2024, 10:14:55 AM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Training;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Skill}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSkill extends GenericItem
{
	/** Qualifier of the <code>Skill.skillName</code> attribute **/
	public static final String SKILLNAME = "skillName";
	/** Qualifier of the <code>Skill.priority</code> attribute **/
	public static final String PRIORITY = "priority";
	/** Qualifier of the <code>Skill.trainings</code> attribute **/
	public static final String TRAININGS = "trainings";
	/** Relation ordering override parameter constants for Training2SkillRelation from ((trainingcore))*/
	protected static String TRAINING2SKILLRELATION_SRC_ORDERED = "relation.Training2SkillRelation.source.ordered";
	protected static String TRAINING2SKILLRELATION_TGT_ORDERED = "relation.Training2SkillRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Training2SkillRelation from ((trainingcore))*/
	protected static String TRAINING2SKILLRELATION_MARKMODIFIED = "relation.Training2SkillRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SKILLNAME, AttributeMode.INITIAL);
		tmp.put(PRIORITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Training");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.priority</code> attribute.
	 * @return the priority
	 */
	public Integer getPriority(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.priority</code> attribute.
	 * @return the priority
	 */
	public Integer getPriority()
	{
		return getPriority( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.priority</code> attribute. 
	 * @return the priority
	 */
	public int getPriorityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPriority( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.priority</code> attribute. 
	 * @return the priority
	 */
	public int getPriorityAsPrimitive()
	{
		return getPriorityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final Integer value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final int value)
	{
		setPriority( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final int value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.skillName</code> attribute.
	 * @return the skillName
	 */
	public String getSkillName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SKILLNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.skillName</code> attribute.
	 * @return the skillName
	 */
	public String getSkillName()
	{
		return getSkillName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.skillName</code> attribute. 
	 * @param value the skillName
	 */
	public void setSkillName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SKILLNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.skillName</code> attribute. 
	 * @param value the skillName
	 */
	public void setSkillName(final String value)
	{
		setSkillName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.trainings</code> attribute.
	 * @return the trainings
	 */
	public Collection<Training> getTrainings(final SessionContext ctx)
	{
		final List<Training> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			"Training",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Skill.trainings</code> attribute.
	 * @return the trainings
	 */
	public Collection<Training> getTrainings()
	{
		return getTrainings( getSession().getSessionContext() );
	}
	
	public long getTrainingsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			"Training",
			null
		);
	}
	
	public long getTrainingsCount()
	{
		return getTrainingsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.trainings</code> attribute. 
	 * @param value the trainings
	 */
	public void setTrainings(final SessionContext ctx, final Collection<Training> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Skill.trainings</code> attribute. 
	 * @param value the trainings
	 */
	public void setTrainings(final Collection<Training> value)
	{
		setTrainings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainings. 
	 * @param value the item to add to trainings
	 */
	public void addToTrainings(final SessionContext ctx, final Training value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainings. 
	 * @param value the item to add to trainings
	 */
	public void addToTrainings(final Training value)
	{
		addToTrainings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainings. 
	 * @param value the item to remove from trainings
	 */
	public void removeFromTrainings(final SessionContext ctx, final Training value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainings. 
	 * @param value the item to remove from trainings
	 */
	public void removeFromTrainings(final Training value)
	{
		removeFromTrainings( getSession().getSessionContext(), value );
	}
	
}
